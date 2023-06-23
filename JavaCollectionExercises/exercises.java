package JavaCollectionExercises;

import java.util.*;

public class exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.");
        System.out.println("2. Viết một chương trình để tạo một HashSet từ một ArrayList.");
        System.out.println("3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.");
        System.out.println("4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.");
        System.out.println("5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.");
        System.out.println("6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.");
        System.out.println("7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.");
        System.out.println("8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần.");
        System.out.println("9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.");
        System.out.println("10. Xóa các phần tử trùng lặp từ một ArrayList.");
        System.out.println("11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.");
        System.out.println("12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.");
        System.out.println("13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.");
        System.out.println("14. Kiểm tra xem một ArrayList có rỗng hay không.");
        System.out.println("15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.");
        System.out.println("16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.");
        System.out.println("17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.");
        System.out.println("18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.");
        System.out.println("19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.");
        System.out.println("20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.");

        int exe = sc.nextInt();
        switch (exe) {
            case 1:
                System.out.println("Bai 1");
                ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
                exe1(numbers);
                break;
            case 2:
                System.out.println("Bai 2");
                ArrayList<Integer> bai2 = new ArrayList<>(List.of(1, 1, 2, 3));
                exe2(bai2);
                break;
            case 3:
                System.out.println("Bai 3");
                LinkedList<String> bai3 = new LinkedList<>(List.of("a", "b", "c"));
                exe3(bai3);
                break;
            case 4:
                System.out.println("Bai 4");
                ArrayList<Integer> bai4 = new ArrayList<>(List.of(1, 2, 3, 5, 7, 10));
                exe4(bai4);
                break;
            case 5:
                System.out.println("Bai 5");
                HashMap<String, Integer> student = new HashMap<>();
                student.put("Nhat", 10);
                student.put("Minh", 18);
                exe5(student);
                break;
            case 6:
                System.out.println("Bai 6");
                ArrayList<String> bai6 = new ArrayList<>(List.of("a", "b", "c"));
                exe6(bai6, "b");
                break;
            case 7:
                System.out.println("Bai 7");
                ArrayList<String> bai7 = new ArrayList<>(List.of("c", "b", "d", "a", "e"));
                exe7(bai7);

                break;
            case 8:
                System.out.println("Bai 8");
                ArrayList<Integer> bai8 = new ArrayList<>(List.of(6, 4, 1, 5, 7));
                exe8(bai8);
                break;
            case 9:
                System.out.println("Bai 9");
                ArrayList<Integer> bai9 = new ArrayList<>(List.of(1, 8, 4, 2, 3));
                exe9(bai9);
                break;
            case 10:
                System.out.println("Bai 10");
                ArrayList<Integer> bai10 = new ArrayList<>(List.of(1, 8, 4, 2, 3, 1, 2));
                exe10(bai10);
                break;
            case 13:
                System.out.println("Bai 13");
                LinkedList<Integer> bai13 = new LinkedList<>(List.of(1,2,3,1,1,1,1));
                exe13(bai13,1);
                break;
            case 14:
                System.out.println("Bai 14");
                ArrayList<Integer> bai14 = new ArrayList<>(List.of(1));
                exe14(bai14);
                break;
            case 15:
                System.out.println("Bai 15");
                ArrayList<Integer> bai15 = new ArrayList<>(List.of(1, 8, 4, 2, 3, 1, 2));
                exe15(bai15, 0, 20);
                break;
            case 17:
                System.out.println("Bai 17");
                ArrayList<Integer> bai17 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
                int[] c = {1, 2, 4, 6};
                exe17(bai17, c);
                break;
            case 18:
                System.out.println("Bai 18");
                LinkedList<Integer> bai18 = new LinkedList<>(List.of(5, 2, 1, 3, 7, 6, 8));
                exe18(bai18);
                break;
            case 19:
                System.out.println("Bai 19");
                HashSet<Integer> bai19 = new HashSet<>(List.of(1, 2, 3, 4, 5));
                exe19(bai19);
                break;
            case 20:
                System.out.println("Bai 20");
                ArrayList<Integer> bai20 = new ArrayList<>(List.of(1, 8, 4, 2, 3, 1, 2, 12));
                System.out.println(bai20);
                exe20(bai20);
                break;
        }
    }

    public static void exe1(ArrayList<Integer> number) {
        int sum = 0;
        for (Integer num : number) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void exe2(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        System.out.println("Mang moi cua hashset: " + set);
    }

    public static void exe3(LinkedList<String> arr) {
        LinkedList<String> rv = new LinkedList<>();
        for (String a : arr) {
            rv.addFirst(a);
        }
        System.out.println(rv);
    }

    public static void exe4(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }

    public static void exe5(HashMap<String, Integer> arr) {
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println("Name: " + name + ", Score: " + score);
        }
    }

    public static void exe6(ArrayList<String> arr, String value) {
        boolean isContain = arr.contains(value);
        if (isContain) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void exe7(ArrayList<String> arr) {
        arr.sort(null);
        System.out.println(arr);
    }

    public static void exe8(ArrayList<Integer> arr) {
        TreeSet<Integer> list = new TreeSet<>(arr);
        System.out.println(list);

    }

    public static void exe9(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        System.out.println("Mang moi cua hashset: " + set);
    }

    public static void exe10(ArrayList<Integer> arr) {
        ArrayList<Integer> newarr = new ArrayList<>();
        for (int a : arr) {
            if (!newarr.contains(a)) {
                newarr.add(a);
            }
        }
        System.out.println(newarr);
    }

    public static void exe20(ArrayList<Integer> arr) {
        System.out.println("Phan tu dau tien: " + arr.get(0));
        int last = arr.size() - 1;
        System.out.println("Phan tu cuoi cung: " + arr.get(last));
    }

    public static void exe19(HashSet<Integer> arr) {
        for (int a : arr) {
            System.out.println("Cac phan tu trong mang: " + a);
        }
    }

    public static void exe18(LinkedList<Integer> arr) {
        System.out.println("Mang chua sap xep: " + arr);
        Collections.sort(arr);
        System.out.println("Mang da sap xep: " + arr);

    }

    public static void exe17(ArrayList<Integer> arr, int[] a) {
        boolean isContain = true;
        for (int i = 0; i < a.length; i++) {
            isContain = arr.contains(a[i]);
        }
        if (isContain) {
            System.out.println("Co chua phan tu");
        } else {
            System.out.println("Khong chua phan tu");
        }

    }

    public static void exe15(ArrayList<Integer> arr, int index, int a) {
        arr.add(index, a);
        System.out.println(arr);
    }

    public static void exe14(ArrayList<Integer> arr) {
        boolean isEmpty = arr.isEmpty();
        System.out.println("Chuoi rong? " + isEmpty);
    }

    public static void exe13(LinkedList<Integer> arr, int index){
        int count = 0;
        for (int i = 0 ; i<arr.size() ; i++){
            if(arr.get(i).equals(index))
                count += 1;
        }
        System.out.println(index + " Xuat hien " + count + " lan");
    }
}
