package cmillan;

import java.util.Arrays;

public class KatasortCsvColumns
{
    public static String sortCsvColumns(String csvFileContent) {
        String[] lines = csvFileContent.split("\n");
        String[] header = lines[0].split(";");
        String[] sortedHeader = lines[0].split(";");
        Integer[] indexes = new Integer[header.length];
        Arrays.sort(sortedHeader, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < header.length; i++) {
            indexes[i] = Arrays.asList(header).indexOf(sortedHeader[i]);
        } // end for
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < header.length; i++) {
            sb.append(header[indexes[i]]);
            if (i < header.length - 1) {
                sb.append(";");
            }
        }
        sb.append("\n");
        for (int i = 1; i < lines.length; i++) {
            String[] line = lines[i].split(";");
            for (int j = 0; j < line.length; j++) {
                sb.append(line[indexes[j]]);
                if (j < line.length - 1) {
                    sb.append(";");
                }
            }if (i < lines.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}