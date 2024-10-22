/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* result = NULL;
    struct ListNode* current = NULL;
    int carry = 0;

    while (l1 || l2 || carry) {
        int val1 = (l1) ? l1->val : 0;
        int val2 = (l2) ? l2->val : 0;
        int sum = val1 + val2 + carry;

        carry = sum / 10;
        int digit = sum % 10;

        // Create a new node to store the current digit.
        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val = digit;
        newNode->next = NULL;

        // If 'result' is null, it means this is the first node.
        // Set 'result' and 'current' to the first node.
        if (!result) {
            result = newNode;
            current = result;
        } else {
            // Append the new node to the existing result.
            current->next = newNode;
            current = newNode;
        }

        // Move to the next nodes in l1 and l2 if they exist.
        if (l1) l1 = l1->next;
        if (l2) l2 = l2->next;
    }

    return result;
}
