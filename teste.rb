Integer:algo = 7

def fibonacci(Integer: x) : Integer
  if x == 1 || x == 0
    return 1
  end

  return fibonacci(x - 1) + fibonacci(x -2)
end


def outra_funcao_legal(String:argumento, Integer:numero) : Integer
  puts(argumento)
  if numero == 10
    return 666
  end

  return 7
end

def main : Void
  Integer:x = 10
  Float:y = 10.0
  String:nome = "DAMAZIO E YVES"
  if x == 10
    puts("ME AJUDA ISIDRO\n")
  end
  while x > 0
    puts(x)
    puts("\n")
    x = x -1
  end
  do
    y = y + 1.0
  while y < 20
  x = 10
  x = x / 2
  puts(x)
  puts("\n")

  y = 20.0
  y = y * 2
  puts(y)
  puts("\n")

  nome = gets()
  puts(nome)
  puts("\n")

  puts("\n")

  puts(fibonacci(10))
  puts("\n")

  if x == 20
    x = 10
  else
    y = 666
  end

  x = fibonacci(10)
  puts(x)
  puts("\n")
end

