package task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {
        File file = new File("Input.txt");
        FileReader fileReader = new FileReader(file);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            String[] bagParams = lines.get(0).split(" ");
            int maxWeight = Integer.parseInt(bagParams[0]);
            int maxItemCount = Integer.parseInt(bagParams[1]);
            List<Item> items = getItems(lines, maxItemCount);

            System.out.println(getMaxItemCount(items, maxWeight));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Item> getItems(List<String> lines, int maxItemCount) {
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= maxItemCount; i++) {
            Item item = new Item();
            String[] itemParams = lines.get(i).split(" ");
            item.cost = Integer.parseInt(itemParams[0]);
            item.weight = Integer.parseInt(itemParams[1]);
            items.add(item);
        }
        return items;
    }

    private static int getMaxItemCount(List<Item> items, int maxWeight) {
        int cMax = 0;

        for (int set = 0; set < Math.pow(2, items.size()); set++) {
            int wItem = 0;
            int cItem = 0;
            for (int i = 0; i < items.size(); i++) {
                int mask = 1 << i;
                if ((set & mask) > 0) {
                    cItem += items.get(i).cost;
                    wItem += items.get(i).weight;
                }
            }
            if (wItem <= maxWeight && cItem > cMax) {
                cMax = cItem;

            }
        }
        return cMax;
    }
}
