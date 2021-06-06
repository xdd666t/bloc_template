package intention_action;

import org.jetbrains.annotations.NotNull;

public class WrapWithBlocBuilderAction extends WrapWithAction {
    public WrapWithBlocBuilderAction() {
        super(SnippetType.BlocBuilder);
    }

    @NotNull
    public String getText() {
        return "Wrap with BlocBuilder";
    }
}
