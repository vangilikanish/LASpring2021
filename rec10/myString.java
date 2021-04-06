package rec10;

public class myString {
    
    private int size;
    private char[] data;

    public MyString(char[] data)
    {
        this.data = data;
        this.size = data.length;

    }


    public MyString(String s)
    {
        this.data = s.toCharArray();
        this.size = s.length();

    }

    public int length(){

        return size;
    }

    public String toString()
    {
        return data.toString();
    }

    public char[] toArray()
    {
        return data;
    }

    public boolean equals(MyString s2)
    {
        if(s2.length() != size)
        {
             return false;
        }

        for(int i = 0; i < size; i++)
        {
            if(data[i] != s2.toArray()[i])
                return false; 
        }
        return true;


    }

    public void replace(int index, char newChar)
    {
        if(index >= size) return;
        data[index] = newChar;
    }

    public void swap(char oldChar, char newChar)
    {
        for(int i = 0; i < size; i++)
        {
            if(data[i] == oldChar)
            {
                data[i] = newChar;
            }
        }

    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(data[i]);
        }
        System.out.println();
    }
    
}

/*
Problem:
Let's code a String class called MyString using array of character. 
The list of methods you can implemented by MyString are: 
length(); return the length of MyString
toString(); return the data as a normal String
toArray(); return the data as an array
equals(MyString s); returns a boolean value representing if s is equal to the data stored
replace(int x,char a) replace index x with the character
replace(char a,char b) all appearance of character a with character b
print(); print the data;
*/
