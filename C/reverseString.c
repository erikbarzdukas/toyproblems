#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

// Stack data structure
typedef struct {
  char data[MAX_SIZE];
  int top;
} Stack;

//Get top of stack
char pop(Stack *stack) {
  char result = stack->data[stack->top];
  stack->top--;

  return result;
}

//Add to stack
void push(Stack *stack, char character) {
  printf("Pushing %s to %d", character, stack->top);
  stack->top++;
  stack->data[stack->top] = character;
}

// Push string onto Stack then pop off Stack to reverse
void reverse(char *string) {
  Stack stack;
  stack.top = 0;
  int stringLength = sizeof(char) / sizeof(string);
  int i = 0;

  for(i; i < stringLength; i++) {
    push(&stack, string[i]);
  }

  printf("Stack data: \n");
  printf("%s\n", stack.data);

  for(i = 0; i < stringLength; i++) {
    string[i] = pop(&stack);
  }

  printf("Reversed string: \n", string);
}

int main(int argc, char *argv[]) {
  printf("%s\n", argv[1]);
  reverse(argv[1]);

  printf("%s\n", argv[1]);
}
