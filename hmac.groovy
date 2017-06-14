//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;

import static System.err
import static System.out
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import java.util.Base64

def cli = getCli()
def options = cli.parse(args)

println ""
printHelp(options)
checkOptions(options)

println("key: ${options.k}")
println("file: ${options.f}")

def key = options.k
try {
    def msg = new File(options.f).getText('UTF-8').trim()
    println("message:\n${msg}")
    def digest = getDigest(key, msg)
    out.println("\nDigest:\n=======\n${digest}\n==========================\n")
    System.exit(0)
} catch(all) {
    err.println("\nError: Could not read file ${options.f}")
    err.println("Exiting ...")
    System.exit(1)
}

def getDigest(String keyString, String msg) {
    def HMAC_ALGORITHM = "HmacSHA256"
    Mac macAlgorithm = Mac.getInstance(HMAC_ALGORITHM)
    macAlgorithm.init(new SecretKeySpec(keyString.getBytes(),HMAC_ALGORITHM))
    return Base64.getEncoder().encodeToString(macAlgorithm.doFinal(msg.getBytes()))
}

def getCli() {
    def cli = new CliBuilder(usage:'hmac.groovy -kf[h]')
    cli.k(longOpt: 'key', 'Secret Key', args: 1, required: false)
    cli.f(longOpt: 'file', 'File containing message to be digested', args: 1, required: false)
    cli.h(longOpt: 'help', 'Show help information', required: false)
    return cli;
}

def checkOptions(def opts) {
    if (!opts || !opts.k || !opts.f) {
        err.println "Invalid options:\n================"
        cli.usage()
        err.println "\nExiting ..."
        System.exit(1)
    }
}

def printHelp(def opts) {
    if (opts?.h) {
        cli.usage()
        System.exit(0)
    }
}
