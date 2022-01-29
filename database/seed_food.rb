# seed_food.rb
require "faker"
foods = []
10.times do |n|
	food = {
		name: Faker::Food.dish,
		photoPath: "breakfast_item.jpg",
		rating: rand(1..5),
		price: rand(30000..55000),
		stock: rand(0..20),
		isSuperSeller: rand(0..1),
		category: rand(1..5),
		qtSold: rand(10..100),
		desc: "Rasanya bikin nyam nyam"
	}
	foods.push(food)	
end

String uri = "mongodb://tom:jerry@localhost";
MongoClient client = MongoClients.create(uri);

# p foods.size
p foods

# langsung push ke mongo?


# random in range in ruby

# "price" : 30000.0,
# "stock" : 4,
# "isSuperSeller": 1,
# "category": 2,
# "desc" : "Rasanya bikin nyam nyam"

# array to json in ruby?
# write file json in ruby?

# food = Faker::Json.shallow_json(width: 3, 
# 		options: { key: 'Name.first_name', value: 'Name.last_name' }
# )



