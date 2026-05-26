class Solution {
    public String capitalizeTitle(String title) {
        String [] arr = title.split(" ");
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<arr.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            if(arr[i].length() > 2)
            {
                    if(Character.isLowerCase(arr[i].charAt(0)))
                    {
                        sb.append(Character.toUpperCase(arr[i].charAt(0)));
                    }
                    else
                    {
                        sb.append(arr[i].charAt(0));
                    }
                    for(int j=1;j<arr[i].length(); j++)
                    {
                        char temp = arr[i].charAt(j);
                        if(Character.isUpperCase(temp))
                        {   
                            temp = Character.toLowerCase(temp);
                        }
                        sb.append(temp);
                    }
                    if(i != 0) s2.append(" "+sb.toString());
                    else s2.append(sb.toString());
            }
            else
            {
                for(int j=0; j<arr[i].length(); j++)
                {
                    char temp = arr[i].charAt(j);
                    if(Character.isUpperCase(temp))
                    {   
                        temp = Character.toLowerCase(temp);
                    }
                    sb.append(temp);
                }
                if(i != 0) s2.append(" "+sb.toString());
                else s2.append(sb.toString());
            }
        }
        return s2.toString();
    }
}