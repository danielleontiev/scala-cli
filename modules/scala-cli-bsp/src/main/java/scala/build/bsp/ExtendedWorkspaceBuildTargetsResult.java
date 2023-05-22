package scala.build.bsp;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

import java.util.List;

@SuppressWarnings("all")
public class ExtendedWorkspaceBuildTargetsResult {
    private List<ExtendedBuildTarget> targets;

    public ExtendedWorkspaceBuildTargetsResult(@NonNull final List<ExtendedBuildTarget> targets) {
        this.targets = targets;
    }

    @Pure
    public List<ExtendedBuildTarget> getTargets() {
        return this.targets;
    }

    public void setTargets(final List<ExtendedBuildTarget> targets) {
        this.targets = targets;
    }

    @Override
    @Pure
    public String toString() {
        ToStringBuilder b = new ToStringBuilder(this);
        b.add("targets", this.targets);
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
        ExtendedWorkspaceBuildTargetsResult other = (ExtendedWorkspaceBuildTargetsResult) obj;
        if (this.targets == null) {
            if (other.targets != null)
                return false;
        } else if (!this.targets.equals(other.targets))
            return false;
        return true;
    }

    @Override
    @Pure
    public int hashCode() {
        return 31 * 1 + ((this.targets== null) ? 0 : this.targets.hashCode());
    }
}
