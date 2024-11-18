package com.mycompany.datastructurerevision3to5;

public class DataStructureRevision3to5 {

    public static void main(String[] args) {
        Array o1 = new Array(35);
        o1.addFirst(56);
        o1.addFirst(13);
        o1.addFirst(57);
        o1.addFirst(58);
        o1.addFirst(59);
        o1.addFirst(60);
        o1.addFirst(58);
        o1.addFirst(59);
        o1.addFirst(13);
        o1.addFirst(5);
        o1.addFirst(59);
        o1.addFirst(13);

        o1.viewAll(" Add First ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.addLast(555);
        o1.addLast(666);
        o1.viewAll(" Add Last ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.addIndex(666, 5);
        o1.viewAll(" Add Index ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.viewAll(" Add First ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.removeFirst();
        o1.viewAll(" Remove First ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.removeLast();
        o1.viewAll(" Remove Last ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.removeIndex(2);
        o1.viewAll(" Remove Index 2");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.updateFirst(256);
        o1.viewAll(" Update First");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.updateLast(1000);
        o1.viewAll(" Update Last");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.updateIndex(888, 8);
        o1.viewAll(" Update Index 8");
        System.out.println("------------------------ END ---------------------------\n ");
        System.out.println("View First");
        o1.viewFirst();
        System.out.println("------------------------ END ---------------------------\n ");
        System.out.println("View Last");
        o1.viewLast();
        System.out.println("------------------------ END ---------------------------\n ");
        System.out.println("View Index 3");
        o1.viewIndex(3);
        System.out.println("------------------------ END ---------------------------\n ");
        System.out.println("======== Linear Search ========");
        System.out.println("Position for value 888 " + o1.linearSearch(888));

        System.out.println("======== binary Search ========");
        System.out.println("Result for value 888 " + o1.binarySearch(888));

        o1.sort("asc");
        o1.viewAll(" Ascending Sorting");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.sort("dsc");
        o1.viewAll(" Descending Sorting");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.viewAll(" Before Replace ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.replaceFirstOccurance(58, 999);
        o1.viewAll(" After Replace ");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.viewAll(" Before Replace ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.replaceLastOccurance(59, 999);
        o1.viewAll(" After Replace ");
        System.out.println("------------------------ END ---------------------------\n ");

        o1.viewAll(" Before Replace All ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.replaceAll(13, 333);
        o1.viewAll(" After Replace ");
        System.out.println("------------------------ END ---------------------------\n ");

        int newData[] = {5001, 5003, 5002};
        o1.viewAll(" Before Merge ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.mergeFirst(newData);
        o1.viewAll(" After Merge ");
        System.out.println("------------------------ END ---------------------------\n ");

        int newDataA[] = {4001, 4003, 4002};
        o1.viewAll(" Before Merge ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.mergeLast(newDataA);
        o1.viewAll(" After Merge ");
        System.out.println("------------------------ END ---------------------------\n ");

        int newDataB[] = {3001, 3003, 3002};
        o1.viewAll(" Before Merge ");
        System.out.println("------------------------ END ---------------------------\n ");
        o1.mergeIndex(newDataB, 3);
        o1.viewAll(" After Merge ");
        System.out.println("------------------------ END ---------------------------\n ");

    }

}
