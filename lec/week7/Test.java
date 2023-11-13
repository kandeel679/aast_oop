public class Test {
    public static void main(String[] args) {
        Book[] Books1 = {(new Book("java",2020, 7500)),
                        (new Book("c++", 2020, 4500))};
        Book[] Books2 = {(new Book("data structures",2019, 5000)),
                        (new Book("itc", 2018, 3000)),
                        (new Book("c#", 2001, 9000))};    
                        
                        
        Author A1 = new Author("ahmed" , 123456789,Books1);
        Author A2 = new Author("ahmed" , 987654321,Books2);

        System.out.println(A1.name + " " +A1.ssn +":"+ A1.totalBooks+":"+ A1.totalPrices );
        for (int i = 0; i < A1.totalBooks; i++) {
            System.out.println("Book"+(i+1)+" "+ A1.list[i].Tital+ ": "+ A1.list[i].year +": "+ A1.list[i].price);
        }

        System.out.println(A2.name + " " +A2.ssn +":"+ A2.totalBooks+":"+ A2.totalPrices );
        for (int i = 0; i < A2.totalBooks; i++) {
            System.out.println("Book"+(i+1)+" "+ A2.list[i].Tital+ ": "+ A2.list[i].year +": "+ A2.list[i].price);
        }
    }
}
