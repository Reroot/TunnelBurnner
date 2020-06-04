package Strings;

public class JSONPrettyPrint {
    private String prettifyJsonIterative(String json){
        if(json == null){
            return json;
        }
        final char[] chars = json.toCharArray();
        StringBuilder builder = new StringBuilder();
        int identationCount= 0;
        int idx= 0;
        String NEW_LINE = "\n";
        while(idx < chars.length){
            char curr = chars[idx];
            if('{' == curr){
                builder.append(getIndentation(identationCount)).append(curr);
                identationCount++;
                builder.append(NEW_LINE).append(getIndentation(identationCount));
            }else if('}' == curr){
                identationCount--;
                builder.append(getIndentation(identationCount)).append(curr).append(NEW_LINE).append(getIndentation(identationCount));
            } else if(','== curr){
                builder.append(curr).append(NEW_LINE).append(getIndentation(identationCount));
            }else{
                builder.append(curr);
            }

            idx++;
        }

        return builder.toString();
    }

    private String getIndentation(int count){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<count; i++){
            builder.append('\t');
        }
        return builder.toString();
    }
    public String prettifyJson(String JSON, boolean isIterative){
        return prettifyJsonIterative(JSON);
    }
}
