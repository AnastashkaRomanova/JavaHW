package SEM4;

import java.util.List;

public class sem3 {
    public static void main(String[] args) {
        List list = new ArrayList();
//
//        list.add(12);
//        list.add("Eleven");
//        list.add(12.5f);
//        list.add(new OutOfMemoryError());
//
//        if (list.get(0) instanceof Integer) {
//            int a = (int) list.get(0);
//        }

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10, 23));
        list.add(4, 23);
//        list.clear();
        System.out.println(list.indexOf(23));
        list.contains(203);
        System.out.println(list.lastIndexOf(23));
        list.remove(4);
        list.remove(new Integer(23));
        list.removeIf(n -> n%1!=0);
        System.out.println(list);
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        list.forEach(k -> {
            int t = k;
            k++;
            System.out.print(k+":");
            t++;
            System.out.println(t);
        });
        list.set(4, 5);
        list.isEmpty();
        list.size();
        List<Integer> list1 = list.subList(1, list.size()/2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer i: list) {
            System.out.println(i);
        }

        ListIterator<Integer> iterator = list.listIterator(list.size()-1);
        while (iterator.hasPrevious()){
            int i = iterator.previous();
//            iterator.remove();
            System.out.println(i);
        }

        list.toArray();

//        System.out.println(list);
//        System.out.println(list1);
//        list.removeAll(list1);
//        list.retainAll(list1);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                if (t0 % 2 == 0 && t0 != t1) return 0;
                return t1 - t0;
            }
        });

        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });

        System.out.println(list);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.getFirst();
        llist.getLast();
        
    }
    
}
