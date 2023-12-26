package OOP.Week12LABS.LABTASKS.strategy;


class UpperCaseFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

class LowerCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}

class CamelCaseFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        String[] parts = text.split(" ");
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
        }

        return camelCaseString;
    }
}

class TextEditor {

    TextFormatter textFormatter;

    public TextEditor() {
    }

    public void setFormatter(TextFormatter txt) {
        this.textFormatter = txt;
    }

    public String formatText(String text) {
        return textFormatter.formatText(text);
    }
}

class Main {
    public static void main(String[] args) {
        TextEditor textEditor1 = new TextEditor();
        textEditor1.setFormatter(new UpperCaseFormatter());

        TextEditor textEditor2 = new TextEditor();
        textEditor2.setFormatter(new LowerCaseFormatter());

        TextEditor textEditor3 = new TextEditor();
        textEditor3.setFormatter(new CamelCaseFormatter());

        System.out.println(textEditor1.formatText("sejo"));
        System.out.println(textEditor2.formatText("SEJO"));
        System.out.println(textEditor3.formatText("sead masetic"));
    }
}