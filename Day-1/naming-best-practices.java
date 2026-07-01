// name should be descriptive -> no to the number series naming like int i1,i2,i3 etc
bool ischildvalGreater(Node *n1, Node *n2)
{
    return n1->val < n2->val;
}

// it should like this way
bool ischildvalGreater(Node *parent, node *child){
    return parent->val < child->val;
}

// name not based on the data structure but it should be searchable name  and do not use magic number

void copy (vector<int>&source, vector<int>&destination){
    for(int i=0;i<source.size();i++){
        destination[i] = source[i];
    }
}



// it not like , int arr[10]; but it like int priceArray[10]; -> here it should not clobing name with data structure , 
// it not a good idea
// it should be like price[10]; and name should be searchable name
// and not use magic number