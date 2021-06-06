package intention_action;

import org.jetbrains.annotations.NotNull;

public class WrapWithRepositoryProviderAction extends WrapWithAction {
    public WrapWithRepositoryProviderAction() {
        super(SnippetType.RepositoryProvider);
    }

    @NotNull
    public String getText() {
        return "Wrap with RepositoryProvider";
    }
}
