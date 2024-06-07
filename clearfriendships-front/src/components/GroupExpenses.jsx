import React from "react";
import CardExpenses from "./CardExpenses";

function GroupExpenses({ expenses }) {
  return (
    <div>
      {expenses.map((e) => (
        <CardExpenses
          key={e.member}
          member={e.member}
          quantity={e.quantity}
          concept={e.concept}
          date={e.date}
        />
      ))}
    </div>
  );
}

export default GroupExpenses;
