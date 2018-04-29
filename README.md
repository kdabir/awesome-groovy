Awesome Groovy [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)
==============

Curated list of awesome groovy libraries, frameworks and resources. Inspired by many other awesome-* repositories. This awesome collection is also available on [Groovy.ZEEF.com](https://groovy.zeef.com/kunal.dabir).


- [Awesome Groovy](#awesome-groovy)
    - [Build Tools, Setup and CI](#build-tools-setup-and-ci)
    - [Concurrency](#concurrency)
    - [Database](#database)
    - [Desktop App Frameworks](#rich-applications)
    - [HTTP](#http)
    - [IDE and Editor Support](#ide-and-editor-support)
    - [Testing](#testing)
    - [Code analysis](#code-analysis)
    - [Web Frameworks](#web-frameworks)
    - [Transpilers](#transpilers)
    - [Static Web](#static-web)
    - [Language Utilities](#language-utilities)
    - [File System Utilities](#file-system-utilities)
    - [File Format DSL](#file-format-dsl)
    - [Scripting Tools](#scripting-tools)
    - [Rule Engines](#rule-engines)
- [Resources](#resources)
- [Contributing](#contributing)
- [Credits](#credits)

## Build tools, setup and CI
* [Gradle](http://www.gradle.org/) - A powerful build system for the JVM
* [GMavenPlus](https://github.com/groovy/GMavenPlus) - A rewrite of GMaven, a Maven plugin for Groovy
* [SDKMAN](http://sdkman.io) - The Software Development Kit Manager (Previously known as GVM)
* [Lazybones](https://github.com/pledbrook/lazybones) - A simple project creation tool that uses packaged project templates.
* [Jenkins job-dsl-plugin](https://github.com/jenkinsci/job-dsl-plugin) - A Groovy DSL for Jenkins Jobs
* [travis-groovy](https://github.com/kdabir/travis-groovy) - execute groovy scripts on travis-ci

## IDE and Editor Support
* [IntelliJ IDEA](http://www.jetbrains.com/idea/) - The Most Intelligent IDE for the Java Platform
* [Groovy Grails Tool Suite](http://spring.io/tools/ggts) -  Eclipse-based IDE optimized for developing, debugging and executing Groovy and Grails applications
* [Groovy Web Console](http://groovyconsole.appspot.com) - The online Groovy console
* [LightTable Plugin](https://github.com/rundis/LightTable-Groovy) - LightTable Support
* [Sublime Text 2/3](https://gist.github.com/kdabir/2203530) - Run groovy scripts from Sublime Text

## Web Frameworks

* [Grails](https://github.com/grails/grails) - A powerful web application framework based on the Groovy language
* [Gaelyk](https://github.com/gaelyk/gaelyk) - A lightweight Groovy toolkit for Google App Engine Java
* [Glide](https://github.com/kdabir/glide) - Create awesome apps on Google App Engine in a snap
* [Ratpack](https://github.com/ratpack/ratpack) - A toolkit for JVM web applications
* [gServ](https://github.com/javaConductor/gserv) - A Groovy toolkit for creating SPAs and REST based micro-services without the need for a container (Tomcat, JBoss, etc.).
* [Spring-Boot](http://projects.spring.io/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that can you can "just run"
* [Micronaut](http://micronaut.io/) - A brand new microservices framework created by the Grails team

## Database
* [Gmongo](https://github.com/poiati/gmongo) - A Groovy wrapper to the mongodb Java driver
* [Gstorm](https://github.com/kdabir/gstorm) - A simple ORM for simple databases and CSV files to be used in groovy scripts
* [Tayra](https://github.com/EqualExperts/Tayra) - Incremental backup tool for MongoDB
* [Groovy-liquibase](https://github.com/tlberglund/groovy-liquibase) - Yet Another Groovy DSL for Liquibase
* [Effigy](https://github.com/cjstehno/effigy) - Groovy annotation-driven JDBC row mapping framework (abandoned)
* [elasticsearch-groovy](https://github.com/elastic/elasticsearch-groovy) - Elasticsearch Groovy client

## Rich Application

* [Griffon](http://griffon-framework.org/) - Griffon is an application framework for developing desktop applications in the JVM
* [GroovyFx](http://groovyfx.org/) - GroovyFX provides a Groovy binding for JavaFX 2.0.

## HTTP
* [Http-Builder](https://github.com/jgritman/httpbuilder) - HTTPBuilder is the easiest way to manipulate HTTP-based resources from the JVM
* [HTTP Builder NG](https://github.com/http-builder-ng/http-builder-ng) - HTTP Builder NG is a modern Groovy DSL for making http requests.
* [HTTP Builder NG Gradle Plugin](https://github.com/http-builder-ng/gradle-http-plugin) - Gradle plugin providing HTTP Builder NG support in a Gradle build configuration.
* [AsyncRestClient](https://github.com/eginez/AsyncRestClient) - Combine the power of RESTClient with RxGroovy for async http calls
* [Groovy-wslite](https://github.com/jwagenleitner/groovy-wslite) - Lightweight SOAP and REST webservice clients for Groovy

## Testing
* [Spock](https://github.com/spockframework/spock) - The Enterprise-ready testing and specification framework.
* [Geb](https://github.com/geb/geb) - Very Groovy Browser Automation
* [Betamax](http://betamax.software/) - Betamax is a tool for mocking external HTTP resources such as web services and REST APIs in your tests.
* [HTTP Mock Server](https://github.com/TouK/http-mock-server) - HTTP Mock Server allows to mock HTTP request using groovy closures.
* [Ersatz Mock Server](https://github.com/cjstehno/ersatz) - A simple and expressive simulated HTTP server for testing client code with configurable responses.
* [Dru](https://agorapulse.github.io/dru/) - Data Reconstruction Utility loads data from external sources JSON, YML for easy testing GORM, DynamoDB or just plain POJOs.
* [Gru](https://agorapulse.github.io/gru/) - Groovy HTTP Testing Framework for running integration and semi-ingetration tests for any HTTP backend with native unit test support for Grails and Spring MVC.

## Concurrency
* [GPars](https://github.com/GPars/GPars) - The GPars concurrency and parallelism framework for the JVM
* [RxGroovy](https://github.com/ReactiveX/RxGroovy) - RxJava bindings for Groovy
* [Vertx](http://vertx.io/) - Vert.x is a lightweight, high performance application platform for the JVM

## Code Analysis
* [CodeNarc](http://codenarc.sourceforge.net/) - Static analysis tool for Groovy
* [Sonar-Groovy](https://github.com/SonarQubeCommunity/sonar-groovy) - SonarQube Groovy plugin

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
* [groovy-extra-list-behaviour](https://github.com/dnahodil/groovy-extra-list-behaviour) - Adds extra methods to Lists via the extension system
* [GPerfUtils](https://github.com/gperfutils) - Groovy-based tools verifying performance of your code
  * [gprof](https://github.com/gperfutils/gprof) - The profiling module for Groovy
  * [gbench](https://github.com/gperfutils/gbench) - The benchmarking module for Groovy

## File System Utilities
* [Groovy-Vfs](https://github.com/ysb33r/groovy-vfs) - A DSL for Groovy on top of Apache VFS2
* [Directree](https://github.com/kdabir/directree) - A Simple DSL to create Directory Tree with Text Files

## File Format DSL
* [document-builder](https://github.com/craigburke/document-builder) - A document builder for Groovy for PDF or Word documents.
* [spreadsheet-builder](http://spreadsheet.dsl.builders/) - Spreadsheet builder provides convenient way how to create MS Excel OfficeOpenXML Documents (XSLX)
* [GroovyCSV](http://xlson.com/groovycsv/) - A simple CSV parsing library for groovy

## Scripting Tools
 * [sshoogr](https://github.com/aestasit/sshoogr) - DSL library for working with remote servers through SSH.


## Rule Engines
* [grules](https://github.com/zhaber/grules) - rule engine for data preprocessing
* [n-cube](https://github.com/jdereg/n-cube) - a Rules Engine, Decision Table, Decision Tree, Templating Engine, and Enterprise Spreadsheet, built as a hyper-space.

# Resources

## Official Resources
* [The official groovy home](http://www.groovy-lang.org/) - Groovy's new home
* [Groovy's source](https://github.com/apache/groovy) - Groovy's source code mirrored on Github
* [Groovy mailing lists](http://www.groovy-lang.org/mailing-lists.html) - Note the new mailing list
* [Official Documentation](http://www.groovy-lang.org/documentation.html) - the definitive source of groovy documentation

## Try Groovy in Browser
* [Groovy Web Console](http://groovyconsole.appspot.com/)
* [Groovy Playground](https://groovy-playground.appspot.com/)

## Groovy Code Examples
* [MrHaKi's Goodness](http://mrhaki.blogspot.com/) - Look out for entries titled "Groovy Goodness" , "Grails Goodness", Gradle Goodness"
* [Groovy Almanac](http://groovy-almanac.org/) - useful code snippets
* [PLEAC Groovy](http://pleac.sourceforge.net/pleac_groovy/) - Groovy is one of the 3 languages out of 32, having completed 100% of PLEAC examples.
* [Langref Groovy](http://langref.org/groovy/) - Covers good number of problem solutions in groovy. Help contributing more solutions

## Staying up to date
* [Groovy Calamari](http://groovycalamari.com/) - Weekly curated publication about the Groovy Ecosystem
* [Groovy Weekly](http://glaforge.appspot.com/category/Groovy%20Weekly) - Groovy weekly newsletter
* [Groovy Blogs](http://groovyblogs.org/) - Interesting collections of Groovy blogs, ususally updated frequently
* [Grails Diary](http://grydeske.net/news) - Particulary useful for Grails developers

## Interactive Learning
* [Groovy-Koans](http://nadavc.github.io/groovykoans/) - Collection of small exercises in the form of unit tests

## Blogs of core committer
* [Guillaume Laforge's blog](http://glaforge.appspot.com/)
* [Cédric Champeau's blog](http://melix.github.io/blog/)
* [Jochen Theodorou's blog](http://blackdragsview.blogspot.com/)
* [Grails Team blog](http://grailsblog.objectcomputing.com/)

## Conferences
* [Greachconf](http://greachconf.com)
* [GR8Conf Europe](http://gr8conf.eu)
* [GR8Conf USA](http://gr8conf.us)

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
