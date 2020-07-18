def take_pics(num)
  return 1 if num == 1
  arr = []
  max = num
  even = (1...max).count { |n| n.even? }
  odd = even = (1...max).count { |n| n.odd? }
  count = 0
  while max > 1
    if num.odd?
      count += even 
      max -= 1
    else
      count += odd 
      max -= 1
    end
  end
  count 
end

print take_pics(10)
