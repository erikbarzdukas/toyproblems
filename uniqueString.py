'''
  Unique string, (O)n
'''
import sys

def check_unique(string):
    memory = {}

    for index, value in enumerate(string):
        #is_unique = memory.get(value, False)
        if memory.get(value, False):
            return False
        else:
            memory[value] = True


    return True

def main():
    if len(sys.argv) < 2:
        print("Need a string to check")
    else:
        if(check_unique(sys.argv[1])):
            print("No duplicate characters")
        else:
            print("Duplicates found")

if __name__ == '__main__':
    main()
