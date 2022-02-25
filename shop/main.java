public class main()
public static void main(String[] args) {
    queue <int> q, q1[5];
    input(Q);
    for i from 1 to Q:
    {
        input(c);
        if(c == 'E')
        {
            input(x);input(y);
            if q has no entry for school x:
                q.push(x);
            q1[x].push(y);
        }
        else
        {
            x = q.front();
            y = q1[x].front();
            q1[x].pop();
            if(q1[x].empty()) q.pop();
            print x and y;
        }
    }   
}
