#!/usr/bin/env groovy

def (debug, query) = new CliBuilder(usage : "./awesome.groovy [options] project-name").with {
    d("debug")
    h("help")
    f("include forks?")
    l("language", args:1)    
    u("username", args:1)

    parse(args).with {
        if (h || !arguments()) {usage(); System.exit(0)}
        else [ d,[arguments(),"in:name", i(f){"forks:true"},i(u){"user:$u"},i(l){"language:$l"}].findAll().flatten().join("+") ]    
    }    
}
def counter = 1
def s = ""
slurp("https://api.github.com/search/repositories?q=${query}&per_page=20", debug).items*.with {
    s = sprintf('%03d', counter++)
    println s + " - [$name]($html_url) - $description"
}

def i(s,c){ if(s) c() }
def slurp(url, debug){ i(debug){println url}; new groovy.json.JsonSlurper().parse(url.toURL()) }