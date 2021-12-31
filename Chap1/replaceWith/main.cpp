#include <iostream>
int sizeOfNullTerminatedString(char *string);
int*findoccurences(char *str,char *ch);

int main() {
    std::cout<<findoccurences("hello!","ll");
    return 0;
}
char* replaceWith(char *str,char *ch,char*replaceWith){
    int size1=sizeOfNullTerminatedString(str);
    int size2=sizeOfNullTerminatedString(ch);
    int size3=sizeOfNullTerminatedString(replaceWith);
    int newsize=0,i,j;
    char *newchar;
    if(size2>size1)return "\0";

}
int sizeOfNullTerminatedString(char *string){
    int retval=0;
    while(*(string+(++retval)));
    return retval;
}
int*findoccurences(char *str,char *ch){
    int *retval=0,j=0,i=0,tmp3=0;
    int size1=sizeOfNullTerminatedString(str);
    int size2=sizeOfNullTerminatedString(ch);
    
    for (int i = 0; i <size1 ; ++i) {
        for (j = 0; j < size2&&(*(str+i)==*(ch+j)); ++j);
        if(j==size2){retval+=1;i+=size2;}
    }
    return retval;
}