Yahoo SmushIt Maven Plugin
==========================

As of Now, this plugin is not in Central Maven repository. 

To use, you'll have to download the source 
and run `mvn install` to install the plugin in your local repository.

##Detailed Steps :
```
1.  git clone https://github.com/nitinsurana/yahoo-smush-maven-plugin.git
2.  mvn install
3.  Add the following to your project's pom.xml
<build>
    <plugins>
      <plugin>
        <groupId>com.snapwiz</groupId>
        <artifactId>yahoosmush</artifactId>
        <version>1.0-SNAPSHOT</version>
      </plugin>
    </plugins>
  </build>
```
