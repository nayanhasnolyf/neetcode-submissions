class Solution {

    public String encode(List<String> strs) {
    String word = new String();
    String encoded_string = new String();
    for(int i =0; i<strs.size();i++)
    {
        word = strs.get(i);
        word = word.length()+"#"+word;
        encoded_string += word;
        word = "";
    }
    return encoded_string;
    } 

    public List<String> decode(String str) {
        List <String> decoded_string_list = new ArrayList<>();
        int j; int num;
        for(int i = 0; i<str.length();i=j+num+1)
        {
            j = str.indexOf('#',i);
            String numb = str.substring(i,j);
            num = Integer.parseInt(numb);
            decoded_string_list.add(str.substring(j+1,num+1+j));
        }
        return decoded_string_list;

    }
}
