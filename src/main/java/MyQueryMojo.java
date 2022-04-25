import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


@Mojo( name = "sayhi")
public class MyQueryMojo
        extends AbstractMojo
{
    @Parameter(property = "query.url", required = false)
    private String url;

    @Parameter(property = "timeout", required = false, defaultValue = "60")
    private int timeout;

    @Parameter(property = "options", required = false)
    private String[] options;

    public void execute()
            throws MojoExecutionException
    {
        getLog().info("hello, " + timeout);
    }
}