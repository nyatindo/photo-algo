def take_pics(even, odd)
  odds = (0...odd).map { |x| x * 2 + 1 }.size
  evens = (0...even).map { |x| x * 2 + 2 }.size
  # the 2 is added because the last value is the added with all odds/evens
  odds * evens + 2
end

print take_pics(2, 3)
