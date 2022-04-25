import org.apache.maven.AbstractMavenLifecycleParticipant;
import org.apache.maven.MavenExecutionException;
import org.apache.maven.execution.MavenSession;
import org.codehaus.plexus.component.annotations.Component;

@Component( role = AbstractMavenLifecycleParticipant.class, hint = "beer")
public class BeerMavenLifecycleParticipant extends AbstractMavenLifecycleParticipant
{

    @Override
    public void afterSessionStart( MavenSession session )
            throws MavenExecutionException
    {
        System.out.print("-------------------ok i can syso afterSessionStart-------------------");
    }

    @Override
    public void afterProjectsRead( MavenSession session )
            throws MavenExecutionException
    {
        System.out.print("-------------------ok i can syso afterProjectsRead-------------------");
    }

}