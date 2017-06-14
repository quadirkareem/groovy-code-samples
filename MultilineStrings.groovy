def x = """
welcom
"""

println "<<<$x>>>"

x = """\
welcome\
"""
println "<<<$x>>>"

def cmd = "cmd" + " /c dir"
Process p =( "cmd" + " /c dir").execute()
println p.text