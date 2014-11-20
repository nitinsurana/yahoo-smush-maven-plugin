package com.snapwiz;

/**
 * Created by nitin on 20-11-2014.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.IOException;

@Mojo(name = "compress")
public class CompressImages extends AbstractMojo {

    @Parameter(property = "compress.imageDir", required = true)
    private Object imageDir;

    @Parameter(property = "compress.verbose", defaultValue = "false")
    private Boolean verbose;

    @Parameter(property = "compress.dryRun", defaultValue = "false")
    private Boolean dryRun;

    @Parameter(property = "compress.imgExtensions", defaultValue = "gif,png,jpeg")
    private String imgExtensions;


    public void execute()
            throws MojoExecutionException, MojoFailureException {
        getLog().info(imageDir.toString());
        getLog().info(verbose.toString());
        getLog().info(dryRun.toString());
        getLog().info(imgExtensions.toString());
        String[] arguments = new String[4];
        arguments[0] = "-imageDir=" + imageDir;
        arguments[1] = "-verbose=" + verbose;
        arguments[2] = "-dryRun=" + dryRun;
        arguments[3] = "-imgExtensions=" + imgExtensions;
        try {
            SmushImages.main(arguments);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
