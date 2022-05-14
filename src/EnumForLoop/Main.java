package EnumForLoop;

import java.util.Objects;

public class Main {
    private enum Extension {
        CSV(".csv"),
        JSON(".json"),
        TEXT(".txt");

        private final String oExtensionString;

        // constructor
        Extension(String aExtension) {
            this.oExtensionString = aExtension;
        }
    }

    private static boolean isValidExtension(String aExtension) {
        for (Extension ext : Extension.values()) {
            if (Objects.equals(aExtension, ext.oExtensionString)) { return true; }
        }
        return false;
    }

    private static void decideFileName(String aFileNameWithoutExtension, String aExtension) {
        System.out.println("Selected extension is " + aExtension);

        if (isValidExtension(aExtension)) {
            System.out.println("FileName is " + aFileNameWithoutExtension + aExtension);
        } else {
            System.out.println("Selected extension is invalid..");
            System.out.println("Default extension(.csv) is selected");
            System.out.println("FileName is " + aFileNameWithoutExtension + ".csv");
        }

        System.out.println(" ");
    }

    public static void main(String[] args) {
        decideFileName("Hoge", ".csv");

        decideFileName("Fuga", ".json");

        decideFileName("Muge", ".txt");

        decideFileName("Muge", ".dat");
    }
}
