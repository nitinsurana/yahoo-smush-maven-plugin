package com.snapwiz;

/**
 * Created by nitin on 20-11-2014.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="echo")
public class EchoMojo extends AbstractMojo {
    /**
     * Any Object to print out.
     *
     * @parameter expression="${echo.message}" default-value="Hello World..."
     */
    @Parameter(property = "echo.message", defaultValue = "Hello World")
    private Object message;

    public void execute()
            throws MojoExecutionException, MojoFailureException {
        getLog().info(message.toString());
    }
}
