package brainFuck;

public class DecrementCommand implements Command {
    public Context perform(char[] contentArray, char[] commandsArray, Context context) {
        --contentArray[context.getContentPosition()];
        return context;
    }
}
