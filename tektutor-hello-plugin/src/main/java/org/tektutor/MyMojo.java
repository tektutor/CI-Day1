package org.tektutor;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Goal prints Hello World.
 *
 * @goal sayHello 
 * 
 * @phase process-sources
 */
public class MyMojo
    extends AbstractMojo
{
    public void execute()
        throws MojoExecutionException
    {
	System.out.println ("*********** Hello Maven Plugin ***********");
    }
}
