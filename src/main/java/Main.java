import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Cafe cafe1 = new Cafe("Avenida", "Calle Pintora 15", -5);
        Cafe cafe2 = new Cafe("Valencia", "Calle Jesos 24", 22);
        Cafe cafe3 = new Cafe("Valencia", "Calle Jesos 24", -2);

        List<Cafe> cafeList = new ArrayList<>();
        cafeList.add(cafe1);
        cafeList.add(cafe2);
        cafeList.add(cafe3);
        System.out.println(findFirst(cafeList));
        System.out.println(counter(cafeList));
        System.out.println(isStartA(cafeList));
        System.out.println(drinksNegative(cafeList));
    }

    public static Cafe findFirst(List list) throws Exception {
        try {
            checkIsEmpty(list);
            Cafe returnCafe = (Cafe) list.get(0);
            System.out.println("Collection is not empty");
            return returnCafe;
        } catch (Exception e) {
            throw new Exception("list is empty");
        }
    }

    public static List<Cafe> isStartA(List<Cafe> list) throws Exception {
        List<Cafe> listStartsA = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (checkIsA(list.get(i))) {
                listStartsA.add(list.get(i));
            }
        }
        if (listStartsA.isEmpty()) throw new Exception("This list doesnt have any names from A(a)");
        return listStartsA;
    }

    public static List<Cafe> drinksNegative(List<Cafe> list) {
        for (int i = 0; i < list.size(); i++) {
            if (checkIsDrinksNegative(list.get(i))) list.get(i).setDrink(0);
        }
        return list;
    }

    public static int counter(List<Cafe> list) {
        int counter = 0;
        for (Cafe listCafe : list) {
            counter++;
        }
        return counter;
    }

    public static boolean checkIsEmpty(List list) {
        Iterator<Cafe> itr = list.iterator();
        boolean check = itr.hasNext();
        return check;
    }

    public static boolean checkIsA(Cafe cafe) {
        boolean check = false;
        String name;
        name = cafe.getName();
        if (name.startsWith("a") || name.startsWith("A")) check = true;
        return check;
    }

    public static boolean checkIsDrinksNegative(Cafe cafe) {
        boolean check = false;
        if (cafe.getDrink() < 0) check = true;
        return check;
    }
}
