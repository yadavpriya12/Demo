package com.mycompany.datastructurerevision3to5;

public class Array {

    private int data[];
    private int currentPosition = -1;

    public Array(int size) {
        data = new int[size];
    }

    public boolean addFirst(int value) {

        if (currentPosition < data.length) {
            currentPosition++;
            for (int i = currentPosition; i > 0; i--) {
                data[i] = data[i - 1];
            }
            data[0] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean addIndex(int value, int index) {

        if (currentPosition < data.length) {
            currentPosition++;
            for (int i = currentPosition; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean addLast(int value) {

        if (currentPosition < data.length) {
            currentPosition++;
            data[currentPosition] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeFirst() {

        if (currentPosition >= 0) {
            for (int i = 0; i < currentPosition; i++) {
                data[i] = data[i + 1];
            }
            data[currentPosition] = 0;
            currentPosition--;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeIndex(int index) {
        if (currentPosition >= 0) {
            for (int i = index; i < currentPosition; i++) {
                data[i] = data[i + 1];
            }
            data[currentPosition] = 0;
            currentPosition--;
            return true;
        } else {
            return false;
        }
    }

    public boolean binarySearch(int value) {
        int tempData[] = new int[currentPosition + 1];
        int index = 0;
        for (int j = 0; j <= currentPosition; j++) {
            tempData[index] = data[j];
            index++;
        }

        for (int i = 0; i <= currentPosition; i++) {
            for (int j = i; j <= currentPosition; j++) {
                if (tempData[i] > tempData[j]) {
                    int temp = tempData[i];
                    tempData[i] = tempData[j];
                    tempData[j] = temp;
                }
            }
        }

        int firstIndex = 0;
        int lastIndex = currentPosition;

        while (firstIndex <= lastIndex) {
            int mid = ((firstIndex + lastIndex) / 2);
            if (tempData[mid] == value) {
                return true;
            } else if (value > tempData[mid]) {
                firstIndex = mid + 1;
            } else if (value < tempData[mid]) {
                lastIndex = mid - 1;
            }
        }
        return false;
    }

    public void sort(String type) {
        if (type.equalsIgnoreCase("asc")) {
            for (int i = 0; i <= currentPosition; i++) {
                for (int j = i; j <= currentPosition; j++) {
                    if (data[i] > data[j]) {
                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }

        } else if (type.equalsIgnoreCase("dsc")) {
            for (int i = 0; i <= currentPosition; i++) {
                for (int j = i; j <= currentPosition; j++) {
                    if (data[i] < data[j]) {
                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
    }

    public boolean removeLast() {
        if (currentPosition >= 0) {
            data[currentPosition] = 0;
            currentPosition--;
            return true;
        } else {
            return false;
        }
    }

    public int getFirst() {
        return data[0];
    }

    public int getLast() {
        return data[currentPosition];
    }

    public int getIndex(int index) {
        return data[index];
    }

    public int linearSearch(int desireValue) {
        for (int i = 0; i <= currentPosition; i++) {
            if (data[i] == desireValue) {
                return i;
            }
        }
        return -1;
    }

    public boolean replaceAll(int oldValue, int newValue) {
        boolean flag = false;

        for (int i = 0; i <= currentPosition; i++) {
            if (data[i] == oldValue) {
                data[i] = newValue;
                flag = true;
            }
        }
        return flag;
    }

    public int replaceFirstOccurance(int oldValue, int newValue) {

        for (int i = 0; i <= currentPosition; i++) {
            if (data[i] == oldValue) {
                data[i] = newValue;
                return i;
            }
        }
        return -1;
    }

    public int replaceLastOccurance(int oldValue, int newValue) {

        for (int i = currentPosition; i >= 0; i--) {
            if (data[i] == oldValue) {
                data[i] = newValue;
                return i;
            }
        }
        return -1;
    }

    public boolean equals(int desireValue) {
        for (int i = 0; i <= currentPosition; i++) {
            if (data[i] == desireValue) {
                return true;
            }
        }
        return false;
    }

    public void updateFirst(int newValue) {
        data[0] = newValue;
    }

    public void updateLast(int newValue) {
        data[currentPosition] = newValue;
    }

    public void updateIndex(int newValue, int index) {
        data[index] = newValue;
    }

    public void viewFirst() {
        System.out.println(data[0]);
    }

    public void viewLast() {
        System.out.println(data[currentPosition]);
    }

    public void viewIndex(int index) {
        System.out.println(data[index]);
    }

    public void viewAll(String message) {
        System.out.println("============= " + message + " =============");
        for (int i = 0; i <= currentPosition; i++) {
            System.out.println(data[i]);
        }
    }

    public boolean mergeFirst(int newArray[]) {
        int newArraySize = newArray.length;
        int totalSize = data.length;
        int availableSize = totalSize - (currentPosition + 1);
        if (availableSize >= newArraySize) {
            int lastLocation = currentPosition;
            currentPosition = newArraySize + currentPosition;
            int tempIndex = currentPosition;
            for (int i = lastLocation; i >= 0; i--) {
                data[tempIndex] = data[i];
                tempIndex--;
            }

            for (int i = 0; i < newArraySize; i++) {
                data[i] = newArray[i];
            }
            return true;
        } else {
            System.out.println("Size is unavailable");
            return false;
        }
    }

    public boolean mergeIndex(int newArray[], int index) {
        int newArraySize = newArray.length;
        int totalSize = data.length;
        int availableSize = totalSize - (currentPosition + 1);
        if (availableSize >= newArraySize) {
            int lastLocation = currentPosition;
            currentPosition = newArraySize + currentPosition;
            int tempIndex = currentPosition;
            for (int i = lastLocation; i >= index; i--) {
                data[tempIndex] = data[i];
                tempIndex--;
            }
            int dataIndex = index;
            for (int i : newArray) {
                data[dataIndex] = i;
                dataIndex++;
            }
            return true;
        } else {
            System.out.println("Size is unavailable");
            return false;
        }
    }

    public boolean mergeLast(int newArray[]) {
        int newArraySize = newArray.length;
        int totalSize = data.length;
        int availableSize = totalSize - (currentPosition + 1);
        if (availableSize >= newArraySize) {
            for (int i : newArray) {
                currentPosition++;
                data[currentPosition] = i;
            }
            return true;
        } else {
            System.out.println("Size is unavailable");
            return false;
        }
    }
}
