package scala.build.bsp;

import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import ch.epfl.scala.bsp4j.BuildTargetIdentifier;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class FormatParams {
    private List<String> uris;

    public FormatParams(final List<String> uris) {
        this.uris = uris;
    }

    @Pure
    public List<String> getUris() {
        return this.uris;
    }

    public void setUris(final List<String> uris) {
        this.uris = uris;
    }

    @Override
    @Pure
    public String toString() {
        ToStringBuilder b = new ToStringBuilder(this);
        b.add("uris", this.uris);
        return b.toString();
    }

    @Override
    @Pure
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FormatParams other = (FormatParams) obj;
        if (this.uris == null) {
            if (other.uris != null)
                return false;
        } else if (!this.uris.equals(other.uris))
            return false;
        return true;
    }

    @Override
    @Pure
    public int hashCode() {
        return 31 * 1 + ((this.uris== null) ? 0 : this.uris.hashCode());
    }
}
