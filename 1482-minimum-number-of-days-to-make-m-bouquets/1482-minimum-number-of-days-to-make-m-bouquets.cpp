class Solution {
public:
    int isPossible(vector<int>& bloomDay,int m,int k,int day){
        // int count=0,noOfB=0;
        // int n=bloomDay.size();
        // for(int i=0;i<n;i++){
        //     if(bloomDay[i]<=day){
        //         count++;
        //     }
        //     else{
        //         noOfB+=(count/k);
        //         count=0;
        //     }
        // }
        // noOfB+=(count/k);
        // if(noOfB>=m) return true;
        // else return false;
        int flowers=0,bouquets=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                flowers++;
                if(flowers==k){
                    bouquets++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        return bouquets>=m;
    }
    int minDays(vector<int>& bloomDay, int m, int k) {
        long long total=1LL* m*k;
        if(total>bloomDay.size()) return -1;
        int low=*min_element(bloomDay.begin(),bloomDay.end());
        int high=*max_element(bloomDay.begin(),bloomDay.end());
        int answer=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,m,k,mid)){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;

    }
};