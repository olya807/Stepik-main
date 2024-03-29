public class printTextPerRole {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder answer = new StringBuilder();
        for (String role : roles) {
            answer.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    answer.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }
}