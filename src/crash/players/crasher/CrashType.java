package crash.players.crasher;

public enum CrashType {
    EXPLOSION,
    POSITION;

    public static CrashType getFromString(String s) {

        for (CrashType type : values()) {
            if (type.name().toLowerCase().contains(s.toLowerCase())) {
                return type;
            }
        }

        return null;

    }

}
