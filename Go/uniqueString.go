package main

import(
  "os"
  "fmt"
)

func uniqueString(stringIn string) bool {
  var memory = make(map[rune]bool)

  for _, char := range stringIn {
    if memory[char] == true {
      return false
    } else {
      memory[char] = true
    }
  }

  return true
}
func main() {
  stringToCheck := os.Args[1]

  if uniqueString(stringToCheck) {
    fmt.Println("No duplicates found")
  } else {
    fmt.Println("Duplicates found")
  }
}
