
def f = /D:\git_repositories\3.0-EXO\exo\com.ciphercloud.o365.exo\com.ciphercloud.o365.exo.core\src\main\resources\office365\defaulttenant\office365-data-protection-policies.xml/
def applicationConfiguration = new XmlParser().parse(f)

def fields = applicationConfiguration.application.entity.field
int cnt = 1
fields.each {
    def fd = it.uniqueId.text().trim()
    def enc = it.tokenizerUniqueId.text().trim().replaceAll("[\\s\r\n]+", " ")
    println "$cnt,$fd,$enc"
    cnt++
}
