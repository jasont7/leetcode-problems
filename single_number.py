class single_number:
    def singleNumber(self, nums: List[int]) -> int:
        x = []
        for n in nums:
            if (n in x):
                x.remove(n)
            else:
                x.append(n)
        return x[0]