package pratice.predicateFunctional;
import java.util.function.Predicate;
public class VotingEligibility 
{

	public static void main(String[] args)
	{
	Predicate <Integer> vote = n -> n==18;
	boolean isEligible = vote.test(17);
	System.out.println("Eligible for voting or not :"+isEligible);

	}

}
