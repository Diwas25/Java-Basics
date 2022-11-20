package LanguageFundamentals.InnerClasses;

interface Hello {

    // Method defined inside interface
    public void show();
}

//Main class
class InnerClassDemo2 implements Hello{
    @Override
    public void show() {
        System.out.println("This a show() method of Hello Interface");

    }
    public static void main(String[] args)
    {
        InnerClassDemo2 df = new InnerClassDemo2();
        df.show();
    }
}
