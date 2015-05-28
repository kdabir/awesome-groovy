Awesome Groovy
==============

Curated list of awesome groovy libraries, frameworks and resources. Inspired by many other awesome-* repositories. This awesome collection is also available on [Groovy.ZEEF.com](https://groovy.zeef.com/kunal.dabir).


- [Awesome Groovy](#awesome-groovy)
    - [Build Tool and Setup](#build-tools-and-setup)
    - [Concurrency](#concurrency)
    - [Database](#database)
    - [Desktop App Framworks](rich-applications)
    - [HTTP](#http)
    - [IDE and Editor Support](#ide-and-editor-support)
    - [Testing](#testing)
    - [Code analysis](#code-analysis)
    - [Web Frameworks](#web-frameworks)
    - [Transpilers](#transpilers)
    - [Static Web](#static-web)
    - [Language Utilities](#language-utilities)
- [Resources](#resources)
- [Contributing](#contributing)
- [Credits](#credits)



## Build tools and Setup
* [Gradle](http://www.gradle.org/) - A powerful build system for the JVM
* [GVM](http://gvmtool.net/) - the Groovy enVironment Manager
* [Lazybones](https://github.com/pledbrook/lazybones) - A simple project creation tool that uses packaged project templates.

## IDE and Editor Support
* [IntelliJ IDEA](http://www.jetbrains.com/idea/) - The Most Intelligent IDE for the Java Platform
* [Groovy Grails Tool Suite](http://spring.io/tools/ggts) -  Eclipse-based IDE optimized for developing, debugging and executing Groovy and Grails applications
* [Groovy Web Console](http://groovyconsole.appspot.com) - The online Groovy console
* [LightTable Plugin](https://github.com/rundis/LightTable-Groovy) - LightTable Support
* [Sublime Text 2](https://gist.github.com/kdabir/2203530) - Run groovy scripts from Sublime Text

## Web Frameworks

* [Grails](https://github.com/grails/grails) - A powerful web application framework based on the Groovy language
* [Gaelyk](https://github.com/gaelyk/gaelyk) - A lightweight Groovy toolkit for Google App Engine Java
* [Glide](https://github.com/kdabir/glide) - Create awesome apps on Google App Engine in a snap
* [Ratpack](https://github.com/ratpack/ratpack) - A toolkit for JVM web applications
* [gServ](https://github.com/javaConductor/gserv) - A Groovy toolkit for creating SPAs and REST based micro-services without the need for a container (Tomcat, JBoss, etc.).
* [Spring-Boot](http://projects.spring.io/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that can you can "just run"

## Database
* [Gmongo](https://github.com/poiati/gmongo) - A Groovy wrapper to the mongodb Java driver
* [Gstorm](https://github.com/kdabir/gstorm) - A simple ORM for simple databases and CSV files to be used in groovy scripts
* [Tyra](https://github.com/EqualExperts/Tayra) - Incremental backup tool for MongoDB
* [Groovy-liquibase](https://github.com/tlberglund/groovy-liquibase) - Yet Another Groovy DSL for Liquibase

## Rich Application

* [Griffon](http://griffon.codehaus.org/) - Griffon is an application framework for developing desktop applications in the JVM
* [GroovyFx](http://groovyfx.org/) - GroovyFX provides a Groovy binding for JavaFX 2.0.

## HTTP
* [Http-Builder](http://groovy.codehaus.org/modules/http-builder/home.html) - HTTPBuilder is the easiest way to manipulate HTTP-based resources from the JVM
* [Groovy-wslite](https://github.com/jwagenleitner/groovy-wslite) - Lightweight SOAP and REST webservice clients for Groovy

## Testing
* [Spock](https://github.com/spockframework/spock) - The Enterprise-ready testing and specification framework.
* [Geb](https://github.com/geb/geb) - Very Groovy Browser Automation
* [Betamax](http://freeside.co/betamax/) - Betamax is a tool for mocking external HTTP resources such as web services and REST APIs in your tests.

## Concurrency
* [GPars](http://gpars.codehaus.org/) - The GPars concurrency and parallelism framework for the JVM
* [RxJava](https://github.com/Netflix/RxJava) - Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.
* [Vertx](http://vertx.io/) - Vert.x is a lightweight, high performance application platform for the JVM 

## Code Analysis
* [CodeNarc](http://codenarc.sourceforge.net/) - Static analysis tool for Groovy

## Transpilers
* [Grooscript](https://github.com/chiquitinxx/grooscript) - Converts your Groovy code to Javascript
 
## Static Web
* [Grain](https://github.com/sysgears/grain) - Static Web Site Building Framework For Groovy
* [Gaiden](https://github.com/kobo/gaiden) - Gaiden is a tool that makes it easy to create documentation with Markdown.

## Language Utilities
* [Functionalgroovy](https://github.com/mperry/functionalgroovy) - Functional programming in Groovy
* [Groovy-stream](https://github.com/timyates/groovy-stream) - A collection of classes to give a fluent builder for Streams (Lazy Groovy Generators)
* [Flipside](https://github.com/johnnywey/flipside) - Simple Groovy options library
* [groovy-common-extensions](https://github.com/timyates/groovy-common-extensions) - Lets you add things commonly useful to the Groovy language via the extension system

# Resources

## Official Site
* [The official groovy home](http://www.groovy-lang.org/) - Groovy's new home
* [Groovy's source](https://github.com/apache/incubator-groovy) - Groovy's source code mirrored on Github
* [Groovy mailing lists](http://www.groovy-lang.org/mailing-lists.html) - Note the new mailing list


## Grails - Web Framework

* [Grails](https://github.com/hitenpratap/awesome-grails) - Grails related all stuff like books, tutorials and tools etc.

## Blogs
* [Guillaume Laforge's blog](http://glaforge.appspot.com/) 
* [MrHaKi's Goodness](http://mrhaki.blogspot.com/) 
* [Cédric Champeau's blog](http://melix.github.io/blog/)

## Interactive Learning

* [Groovy-Koans](http://nadavc.com/groovykoans/) - Collection of small exercises in the form of unit tests

# Contributing

Fork this repository, edit this file and send a pull request.


## Using awesome.groovy script

You can use the `awesome.groovy` script to search awesome projects on github and generate the entry prepoulated with project name, repo url and description in markdown format. All you need to do is place it under right group in the markdown list in `README.md`.

### Examples 

to find out repos where language is groovy and whose name contain gpars and

    ./awesome.groovy -l groovy gpars

to find out repos by user 'kdabir' and name contains glide

    ./awesome.groovy -u kdabir glide

to find out repos whose name contains glide

    ./awesome.groovy glide

If you are lazy to download the repo, an easy way is:

    groovy "https://git.io/awesome" -l groovy glide

# Credits

To all the awesome-* repos out there and their aggreators like [this](https://github.com/erichs/awesome-awesome) and [this](https://github.com/bayandin/awesome-awesomeness).
