import React from "react";
import CardMembers from "./CardMembers";

function GroupMembers({ members, totalMembers, totalSpent }) {
  return (
    <div>
      {members.map((e) => (
        <CardMembers
          key={e.name}
          totalMembers={totalMembers}
          totalSpent={totalSpent}
          name={e.name}
          spent={e.spent}
        />
      ))}
    </div>
  );
}

export default GroupMembers;
