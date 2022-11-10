#include<stdio.h>


void afisare(int *v, int n)
{
    int i;
    for(i = 0; i < n; i++)
    {
        printf("%d ",v[i]);
    }
    printf("\n");
}

void sortare(int *v,int n){
    int i,m=(n-1)/2,a,j,aux,tmp;
    //printf("%d \n\n",v[m]);
    for(i = m - 1 ,j = m + 1; i > 0 || j < n ; i--, j++)
    {
        if(i <= 0)
            i = 0;
        a=i;
        tmp=v[i];
        //printf("%d\n",v[a]);
        while((a < j-1) && tmp > v[a+1]){

            v[a]=v[a+1];
            a++;

        }
        //printf("%d   =  %d\n", (a < j-1), v[a] > v[a+1]);
        v[a]=tmp;

        a=j;
        tmp=v[j];
        //printf("%d\n",v[a]);
        while((a > i+1) && tmp < v[a-1]){

            v[a]=v[a-1];
            a--;

        }
        v[a]=tmp;

        printf("%d - ", i);
        afisare(v,n);


    }
}
int main()
{
    int v[10]={9,5,6,2,8,1,3,7};
    int n=8;
    afisare(v,n);
    sortare(v,n);
    //afisare(v,n);
    return 0;
}
/*if(i <= 0)
            i = 0;
        a = i+1;
        if(v[i] > v[a])
        {
            tmp = v[i];
            //printf("%d %d\n",tmp,v[a]);
            while(tmp > v[a] && a < j)
            {
                v[a-1] = v[a];
                a++;
            }
            v[a-1] = tmp;
            afisare(v,n);
        }*/
