def take_pics(even, odd)
  odds = (0...odd).map { |x| x * 2 + 1 }.size 
  evens = (0...even).map { |x| x * 2 + 2 }.size
  # the 2 is added because the last value is the added with all odds/evens
  (odds > 1 ? odds + 1 : odds) * (evens > 1 ? evens  + 1 : evens)
end

print take_pics(1, 1)
