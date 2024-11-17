package DesignPatterns.ProxyPattern;

public interface Library {
    void borrowBook(String memberName, String bookName);
}

class RealLibrary implements Library{
    @Override
    public void borrowBook(String memberName, String bookName) {
        System.out.println(memberName+" borrowed the Book : "+bookName);
    }
}

class ProxyLibrary implements Library{
    private RealLibrary realLibrary;

    public ProxyLibrary(){
        this.realLibrary = new RealLibrary();
    }
    @Override
    public void borrowBook(String memberName, String bookName) {
        if(isMember(memberName)){
            realLibrary.borrowBook(memberName,bookName);
        } else{
            System.out.println("Access denied: "+memberName+" is not Registered");
        }
    }
    public boolean isMember(String memberName){
        return memberName.equalsIgnoreCase("Alice") || memberName.equalsIgnoreCase("Nomi");
    }
}
