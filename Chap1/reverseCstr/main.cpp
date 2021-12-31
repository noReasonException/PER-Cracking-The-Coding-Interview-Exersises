#include <iostream>
void swap(char *, char*);
bool reverse(char *);
int main() {
    char b[200];
    scanf("%s",b);
    reverse(b);
    printf("%s",b);
}
bool reverse(char *str){
    int tmp=0,mid=0,start=0,tmp2;
    while(*(str+(++tmp)));
    tmp-=1;
    mid=(int)tmp/2;
    while(tmp>mid){
        swap(str+start,str+tmp);
        start+=1;
        tmp-=1;
    }
    return true;

}

void swap(char *p1,char *p2){
    char tmp;
    tmp=*p1;
    *p1=*p2;
    *p2=tmp;
    return;
}