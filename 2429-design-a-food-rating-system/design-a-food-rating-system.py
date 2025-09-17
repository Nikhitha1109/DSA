import heapq

class FoodRatings:

    def __init__(self, foods, cuisines, ratings):
        
        self.food_to_info = {}
        
        
        self.cuisine_to_heap = {}

        for f, c, r in zip(foods, cuisines, ratings):
            self.food_to_info[f] = [c, r]   
            if c not in self.cuisine_to_heap:
                self.cuisine_to_heap[c] = []
            heapq.heappush(self.cuisine_to_heap[c], (-r, f))  

    def changeRating(self, food, newRating):
        cuisine, _ = self.food_to_info[food]
        self.food_to_info[food][1] = newRating

        heapq.heappush(self.cuisine_to_heap[cuisine], (-newRating, food))

    def highestRated(self, cuisine):
        heap = self.cuisine_to_heap[cuisine]

        while heap:
            rating, food = heap[0]
            rating = -rating
            if self.food_to_info[food][1] == rating:
                return food
            heapq.heappop(heap)  
