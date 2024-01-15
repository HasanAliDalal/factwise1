FactWise1 Q5

//Gas Station//

class solution {
    public int canCompleteCircuit(int[]gas, int[] cost) 

    {
        int length = gas.length;
        int gasAvailable = 0;
        int gasUsed = 0;
        int paid = 0;
        int startingPoint = 0;
        for (int i=0; i<length; i++)

        {
            gasUsed += gas[i];
            paid += cost[i];
            gasAvailable += gas[i] - cost[i];
            if (gasAvailables < 0) {
                gasAvailable = 0;
                startingPoint = i + 1;
}             


        }

        return paid > gasUsed ? -1: startingPoint;
    }
}